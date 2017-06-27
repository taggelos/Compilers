package compiler;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import compiler.assembly.Assembler;
import compiler.lexer.Lexer;
import compiler.node.Start;
import compiler.parser.*;
import compiler.symboltable.Quad;
import compiler.symboltable.SymbolTable;
import compiler.visitors.*;

public class Main {

    public static void main(String args[]) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fop = null,fop2=null;
        File file,fileUpgrade;
        if(args.length < 1){
            System.err.println("Usage: java Main <inputFile1> [<inputFile2>] ...");
            System.exit(1);

        }

        for(int i = 0; i < args.length; i++) {
            try {
            	File fold = new File(args[i]);
            	//System.err.println(new File(fold.getParent()+"/../ir/", fold.getName()));
                fis = new FileInputStream(args[i]);
                file = new File(fold.getParent()+"/../ir/", fold.getName().replace(".", "_")+"_ir.txt");
                fileUpgrade = new File(fold.getParent()+"/../irupgrade/", fold.getName().replace(".", "_")+"_irUpgrade.txt");
    			
    			
                
                Parser p = new Parser(
                        new Lexer(
                            new PushbackReader(
                                new InputStreamReader(fis), 1024
                        )
                    )
                );
                try {
                    Start tree = p.parse();
                    System.out.println(tree.toString());
                    
                    FunctionVisitor fv = new FunctionVisitor();
                    tree.apply(fv);
                    
                    SymbolTable symboltable = new SymbolTable(FunctionVisitor.methods);
                    //symboltable.printST();
                    
                    if(fv.errors.isEmpty()){
                    	fop = new FileOutputStream(file);
                    	fop2 = new FileOutputStream(fileUpgrade);
                    	if (!file.exists()) {
            				file.createNewFile();
            			}
                    	IrVisitor iv = new IrVisitor(symboltable);
                    	tree.apply(iv);
                    	IrVisitor2 iv2 = new IrVisitor2(iv.h.quads,symboltable);
                    	iv2.create();
                    	for(Quad q : iv.h.quads) {
                    		fop.write((q.printQuad()+'\n').getBytes());
                    	}
                    	for(Quad q : iv2.h2.quads) {
                    		fop2.write((q.printQuad()+'\n').getBytes());
                    	}
                    	
                    	Assembler as = new Assembler(iv.h.quads, symboltable);
                    	as.create();                    	
                  
                    	fop.flush();
            			fop.close();
                    	fop2.flush();
            			fop2.close();
                    }
                    
        			
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
            catch(FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            } 
            finally {
                try {
                    if(fis != null && fop!=null && fop2!=null)
                        fis.close();
	                	//fop.close();
	                	//fop2.close();
                } 
                catch(IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            System.out.println("--------------"+ args[i] +"--------------");
        }
        System.exit(0);
    }

}
