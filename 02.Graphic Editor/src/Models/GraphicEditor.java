/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import Interfaces.IShape;

/**
 *
 * @author Rishindo
 */
public class GraphicEditor {
    public void DrawShape(IShape shape){
        System.out.println(shape.Drow());
    }
}
