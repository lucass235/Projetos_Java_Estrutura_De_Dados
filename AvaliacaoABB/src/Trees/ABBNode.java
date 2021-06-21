package Trees;

class ABBNode<T extends Comparable<T>> {

    private T info;
    private ABBNode<T> left;
    private ABBNode<T> right;

    ABBNode(T info) {
        this.info = info;
    }

    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

    ABBNode<T> getLeft() {
        return left;
    }

    void setLeft(ABBNode<T> left) {
        this.left = left;
    }

    ABBNode<T> getRight() {
        return right;
    }

    void setRight(ABBNode<T> righ) {
        this.right = righ;
    }

    void insertNodeRepetidos(T value) {
        
         if (value.compareTo(this.getInfo()) < 0) {
            // condicao do valor ser menor do que o no atual.
            if (this.left == null) {
                // cindicao do no atual ser null.
                this.left = new ABBNode(value);
                System.out.println("Valor inserido");// fim da insersao.
            } else {
                // condicao do no atual estar com valor.
                this.left.insertNodeRepetidos(value); // chamada recursiva
            }
        } else {
            // condicao do valor ser maior do que o no atual.
            if (this.right == null) {
                // condicao do no atual ser null.
                this.right = new ABBNode(value);
                System.out.println("Valor inserido");// fim da insersao.
            } else {
                // condicao do no atual com valor.
                this.right.insertNodeRepetidos(value); // chamada recursiva
            }
        }
    }

}
