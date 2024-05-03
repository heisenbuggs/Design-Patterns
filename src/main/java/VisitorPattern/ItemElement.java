package VisitorPattern;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
