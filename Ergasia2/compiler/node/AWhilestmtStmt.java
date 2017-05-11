/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import java.util.*;
import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AWhilestmtStmt extends PStmt
{
    private PExpr _cond_;
    private final LinkedList<PStmt> _body_ = new LinkedList<PStmt>();

    public AWhilestmtStmt()
    {
        // Constructor
    }

    public AWhilestmtStmt(
        @SuppressWarnings("hiding") PExpr _cond_,
        @SuppressWarnings("hiding") List<?> _body_)
    {
        // Constructor
        setCond(_cond_);

        setBody(_body_);

    }

    @Override
    public Object clone()
    {
        return new AWhilestmtStmt(
            cloneNode(this._cond_),
            cloneList(this._body_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhilestmtStmt(this);
    }

    public PExpr getCond()
    {
        return this._cond_;
    }

    public void setCond(PExpr node)
    {
        if(this._cond_ != null)
        {
            this._cond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cond_ = node;
    }

    public LinkedList<PStmt> getBody()
    {
        return this._body_;
    }

    public void setBody(List<?> list)
    {
        for(PStmt e : this._body_)
        {
            e.parent(null);
        }
        this._body_.clear();

        for(Object obj_e : list)
        {
            PStmt e = (PStmt) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._body_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cond_)
            + toString(this._body_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cond_ == child)
        {
            this._cond_ = null;
            return;
        }

        if(this._body_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cond_ == oldChild)
        {
            setCond((PExpr) newChild);
            return;
        }

        for(ListIterator<PStmt> i = this._body_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStmt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}