/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AReturnstmtStmt extends PStmt
{
    private PExpr _returnexpr_;

    public AReturnstmtStmt()
    {
        // Constructor
    }

    public AReturnstmtStmt(
        @SuppressWarnings("hiding") PExpr _returnexpr_)
    {
        // Constructor
        setReturnexpr(_returnexpr_);

    }

    @Override
    public Object clone()
    {
        return new AReturnstmtStmt(
            cloneNode(this._returnexpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReturnstmtStmt(this);
    }

    public PExpr getReturnexpr()
    {
        return this._returnexpr_;
    }

    public void setReturnexpr(PExpr node)
    {
        if(this._returnexpr_ != null)
        {
            this._returnexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._returnexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._returnexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._returnexpr_ == child)
        {
            this._returnexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._returnexpr_ == oldChild)
        {
            setReturnexpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
