/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class TSemi extends Token
{
    public TSemi()
    {
        super.setText(";");
    }

    public TSemi(int line, int pos)
    {
        super.setText(";");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSemi(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSemi(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSemi text.");
    }
}
