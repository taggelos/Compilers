/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AExpr4Expr extends PExpr
{
    private PVarDec _varDec_;

    public AExpr4Expr()
    {
        // Constructor
    }

    public AExpr4Expr(
        @SuppressWarnings("hiding") PVarDec _varDec_)
    {
        // Constructor
        setVarDec(_varDec_);

    }

    @Override
    public Object clone()
    {
        return new AExpr4Expr(
            cloneNode(this._varDec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpr4Expr(this);
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