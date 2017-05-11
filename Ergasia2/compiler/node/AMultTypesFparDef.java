/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AMultTypesFparDef extends PFparDef
{
    private TRef _ref_;
    private TIdentifier _name_;
    private PTypes _type_;
    private PFparDef _fparDef_;

    public AMultTypesFparDef()
    {
        // Constructor
    }

    public AMultTypesFparDef(
        @SuppressWarnings("hiding") TRef _ref_,
        @SuppressWarnings("hiding") TIdentifier _name_,
        @SuppressWarnings("hiding") PTypes _type_,
        @SuppressWarnings("hiding") PFparDef _fparDef_)
    {
        // Constructor
        setRef(_ref_);

        setName(_name_);

        setType(_type_);

        setFparDef(_fparDef_);

    }

    @Override
    public Object clone()
    {
        return new AMultTypesFparDef(
            cloneNode(this._ref_),
            cloneNode(this._name_),
            cloneNode(this._type_),
            cloneNode(this._fparDef_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultTypesFparDef(this);
    }

    public TRef getRef()
    {
        return this._ref_;
    }

    public void setRef(TRef node)
    {
        if(this._ref_ != null)
        {
            this._ref_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ref_ = node;
    }

    public TIdentifier getName()
    {
        return this._name_;
    }

    public void setName(TIdentifier node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public PTypes getType()
    {
        return this._type_;
    }

    public void setType(PTypes node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public PFparDef getFparDef()
    {
        return this._fparDef_;
    }

    public void setFparDef(PFparDef node)
    {
        if(this._fparDef_ != null)
        {
            this._fparDef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fparDef_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ref_)
            + toString(this._name_)
            + toString(this._type_)
            + toString(this._fparDef_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ref_ == child)
        {
            this._ref_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._fparDef_ == child)
        {
            this._fparDef_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ref_ == oldChild)
        {
            setRef((TRef) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TIdentifier) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PTypes) newChild);
            return;
        }

        if(this._fparDef_ == oldChild)
        {
            setFparDef((PFparDef) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
