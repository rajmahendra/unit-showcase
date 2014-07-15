/*
 * Copyright 2014 JUGChennai.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.unitshowcase;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.math.MathContext;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.unitsofmeasurement.impl.AbstractQuantity;
import org.unitsofmeasurement.impl.util.SI;
import org.unitsofmeasurement.impl.util.US;

/**
 *
 * @author dwbs
 */
public class MassConverterTest {
    
    public MassConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
//    @Test
//    public void testMass()
//    {
//        AbstractQuantity<Length> l = AbstractQuantity.of(100d, SI.METRE);
//        System.out.println(SI.METRE.toString());
//		System.out.println(l);
//		l = AbstractQuantity.of(74L, US.FOOT);
//		System.out.println(l);
//		l = l.to(SI.METRE);
//		System.out.println(l);
//               
//		AbstractQuantity<Mass> m = AbstractQuantity.of(85d, SI.KILOGRAM);
//                
//                m=m.to(US.POUND,MathContext.DECIMAL128);
//		System.out.println(m.decimalValue(US.POUND, MathContext.UNLIMITED));
//
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
