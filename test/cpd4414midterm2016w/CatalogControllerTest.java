/*
 * Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.
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
package cpd4414midterm2016w;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CatalogControllerTest {
    
    public CatalogControllerTest() {
    }

    @Test
    public void testGetCatalogById() {
        System.out.println("getCatalogById");
        int id = 42;
        CatalogController instance = new CatalogController();
        
        Catalog expResult = new Catalog();
        expResult.setId(42);
        expResult.setName("cursus.");
        expResult.setDescription("eget, ipsum. Donec sollicitudin adipiscing ligula. Aenean gravida nunc sed pede. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vel arcu eu odio tristique pharetra. Quisque ac libero nec ligula consectetuer rhoncus. Nullam velit dui,");
        expResult.setQuantity(5);
        Catalog result = instance.getCatalogById(id);
        assertEquals(expResult.toString(), result.toString());        
    } 
    
}
