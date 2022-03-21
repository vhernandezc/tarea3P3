/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolb;

/**
 *
 * @author vh367
 */
public class clsArbolBusqueda {

    clsNode root;

    public class clsNode {

        protected int val;
        protected clsNode leftChild, rightChild;
    }

    public void inserta(int data) {
        clsNode newNode = new clsNode();
        if (this.root == null) { // Si es el primer nodo, es decir, el nodo raíz es nulo, simplemente cree un nuevo nodo
            this.root = newNode;
        } else {
            this.insertNode(this.root, newNode);// El nodo padre del nodo actual
        }
  
    }
    
    public void insertNode(clsNode node, clsNode newNode) {
        if (newNode.val < node.val) {// Si el valor insertado es menor que el valor del nodo actual, busque desde el subárbol izquierdo
            if (node.leftChild == null) { // Hasta que el nodo actual sea nulo
                node.leftChild = newNode;
            } else {
                this.insertNode(node.rightChild, newNode);// Establece el nodo secundario derecho del nodo primario del nodo actual en el nodo recién creado
            }
        } else {
            // Si el valor insertado es mayor que el valor del nodo actual, busque desde el subárbol izquierdo
            if (node.rightChild == null) {// Hasta que el nodo actual sea nulo
                node.rightChild = newNode;
            } else {
                this.insertNode(node.rightChild, newNode);
            }
        }
    }

   

    public void inOrder(clsNode localNode) {

        if (localNode != null) {

            inOrder(localNode.leftChild);
            System.out.println(localNode.val);
            inOrder(localNode.rightChild);

        }
    }
    
    
  

    public void preOrder(clsNode localNode) {

        if (localNode != null) {
            System.out.println(localNode.val);
            preOrder(localNode.leftChild);
            preOrder(localNode.rightChild);
        }
    }

    
    
    
    public void posOrder(clsNode localNode) {

        if (localNode != null) {
            posOrder(localNode.leftChild);
            posOrder(localNode.rightChild);
            System.out.println(localNode.val);
        }
    }
    
    
    
    
    
    public clsNode buscar(int value) {

    clsNode current = root;

    while(current.val != value) {

        if(value < current.val) {
            current = current.leftChild;
        }
        else {
            current = current.rightChild;
        }
        if(current == null) {
            return null;
        }
    }

    return current;
    
    
    
}

    public static void main(String[] args) {
     
        
    }
}
