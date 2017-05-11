/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class TRef extends Token
{
    public TRef()
    {
        super.setText("ref");
    }

    public TRef(int line, int pos)
    {
        super.setText("ref");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRef(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRef(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRef text.");
    }
}
