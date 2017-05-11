/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import java.util.*;
import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AArrayTypes extends PTypes
{
    private PDataTypes _dataTypes_;
    private final LinkedList<PArrayTypes> _arrayTypes_ = new LinkedList<PArrayTypes>();

    public AArrayTypes()
    {
        // Constructor
    }

    public AArrayTypes(
        @SuppressWarnings("hiding") PDataTypes _dataTypes_,
        @SuppressWarnings("hiding") List<?> _arrayTypes_)
    {
        // Constructor
        setDataTypes(_dataTypes_);

        setArrayTypes(_arrayTypes_);

    }

    @Override
    public Object clone()
    {
        return new AArrayTypes(
            cloneNode(this._dataTypes_),
            cloneList(this._arrayTypes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayTypes(this);
    }

    public PDataTypes getDataTypes()
    {
        return this._dataTypes_;
    }

    public void setDataTypes(PDataTypes node)
    {
        if(this._dataTypes_ != null)
        {
            this._dataTypes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dataTypes_ = node;
    }

    public LinkedList<PArrayTypes> getArrayTypes()
    {
        return this._arrayTypes_;
    }

    public void setArrayTypes(List<?> list)
    {
        for(PArrayTypes e : this._arrayTypes_)
        {
            e.parent(null);
        }
        this._arrayTypes_.clear();

        for(Object obj_e : list)
        {
            PArrayTypes e = (PArrayTypes) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._arrayTypes_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dataTypes_)
            + toString(this._arrayTypes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dataTypes_ == child)
        {
            this._dataTypes_ = null;
            return;
        }

        if(this._arrayTypes_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dataTypes_ == oldChild)
        {
            setDataTypes((PDataTypes) newChild);
            return;
        }

        for(ListIterator<PArrayTypes> i = this._arrayTypes_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArrayTypes) newChild);
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
