/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolb;

import org.w3c.dom.Node;

/**
 *
 * @author vh367
 */
public class clsNode {
  
    // valor del nodo
    protected int   val;
    // Referencia del nodo secundario izquierdo
    protected clsNode  leftChild;
    // Referencia del nodo secundario derecho
    protected clsNode  rightChild;

    public clsNode(int data,clsNode left,clsNode right){
        this.val=data;
        this.leftChild=left;
        this.rightChild=right;
    }

   
 
}

