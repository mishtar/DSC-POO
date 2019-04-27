/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.pl.eshop.dto.Categoria;

/**
 *
 * @author dell
 */
public class CategoriaUnitTests {
    
    Categoria categoria;
    
    public CategoriaUnitTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        categoria = new Categoria();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test (expected = IllegalArgumentException.class)
    public void CheckNegativeOrZeroId(){
        categoria.setId(-1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CheckNullId(){
        categoria.setId(null);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CheckNullName(){
        categoria.setNombre(null);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CheckEmptyName(){
        categoria.setNombre("");
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CheckLengthName(){
        categoria.setNombre("ab");
    }
    
    @Test
    public void CheckCategoria(){
        assertEquals(categoria.getNombre(),"");
    }
}
