/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class ALefterhsLine extends PLine
{
    private PVarDec _varDec_;

    public ALefterhsLine()
    {
        // Constructor
    }

    public ALefterhsLine(
        @SuppressWarnings("hiding") PVarDec _varDec_)
    {
        // Constructor
        setVarDec(_varDec_);

    }

    @Override
    public Object clone()
    {
        return new ALefterhsLine(
            cloneNode(this._varDec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALefterhsLine(this);
    }

    public PVarDec getVarDec()
    {
        return this._varDec_;
    }

    public void setVarDec(PVarDec node)
    {
        if(this._varDec_ != null)
        {
            this._varDec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDec_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varDec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varDec_ == child)
        {
            this._varDec_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varDec_ == oldChild)
        {
            setVarDec((PVarDec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}