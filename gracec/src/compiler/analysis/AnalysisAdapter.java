/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.analysis;

import java.util.*;
import compiler.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDef(AFunDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHeader(AHeader node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleParFparDef(ASimpleParFparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultParFparDef(AMultParFparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultTypesFparDef(AMultTypesFparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemiParFparDef(ASemiParFparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneFparDef(ANoneFparDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntDataTypes(AIntDataTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharDataTypes(ACharDataTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABracketsArrayTypes(ABracketsArrayTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleTypes(ASimpleTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayTypes(AArrayTypes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleReturnType(ASimpleReturnType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneReturnType(ANoneReturnType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunLocalDef(AFunLocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecLocalDef(ADecLocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarLocalDef(AVarLocalDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDec(AFunDec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlock(ABlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemiStmt(ASemiStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentStmt(AAssignmentStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockStmt(ABlockStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunCalStmt(AFunCalStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfstmtStmt(AIfstmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhilestmtStmt(AWhilestmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnstmtStmt(AReturnstmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdLVal(AIdLVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringLVal(AStringLVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdBracketsLVal(AIdBracketsLVal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunCal(AFunCal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleExprList(ASimpleExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListExprList(AListExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneExprList(ANoneExprList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDef(AVarDef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVarIds(AIdVarIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListVarIds(AListVarIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhilestmt(AWhilestmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileWithElse(AWhileWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfstmt(AIfstmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfHeader(AIfHeader node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoElseIfTrail(ANoElseIfTrail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWithElseIfTrail(AWithElseIfTrail node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemiStmtWithElse(ASemiStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentStmtWithElse(AAssignmentStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtReturnstmtStmtWithElse(AStmtReturnstmtStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtFuncalStmtWithElse(AStmtFuncalStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockStmtWithElse(ABlockStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfStmtWithElse(AIfStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileStmtWithElse(AWhileStmtWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElse(AIfElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondNotCond(ACondNotCond node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondOrAndCond(ACondOrAndCond node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondAndConditionalOrExpression(ACondAndConditionalOrExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondOrConditionalOrExpression(ACondOrConditionalOrExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparativeConditionalAndExpression(AComparativeConditionalAndExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExprConditionalAndExpression(AAndExprConditionalAndExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelationalComparativeExpression(ARelationalComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualComparativeExpression(AEqualComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualComparativeExpression(ANotEqualComparativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditiveRelationalExpression(AAdditiveRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanRelationalExpression(ALessThanRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanRelationalExpression(AGreaterThanRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterEqualThanRelationalExpression(AGreaterEqualThanRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessEqualThanRelationalExpression(ALessEqualThanRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASemiReturnstmt(ASemiReturnstmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddExpr(AAddExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubExpr(ASubExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFactor(AMultFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModFactor(AModFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivFactor(ADivFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTerm(AIntTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTerm(ACharTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALValTerm(ALValTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunCalTerm(AFunCalTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParTerm(AParTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusPlusOrMinus(APlusPlusOrMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusPlusOrMinus(AMinusPlusOrMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhiteSpace(TWhiteSpace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscapeSeq(TEscapeSeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFun(TFun node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNothing(TNothing node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRef(TRef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntegers(TIntegers node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharConst(TCharConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringLiteral(TStringLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNeq(TNeq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLteq(TLteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGteq(TGteq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLAg(TLAg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRAg(TRAg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
