/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class TFun extends Token
{
    public TFun()
    {
        super.setText("fun");
    }

    public TFun(int line, int pos)
    {
        super.setText("fun");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFun(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFun(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFun text.");
    }
}
