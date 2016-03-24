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

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CatalogTest {

    public CatalogTest() {
    }

    @Test
    public void testSetId1ThenGetIdReturns1() {
        Catalog instance = new Catalog();
        instance.setId(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNameBobThenGetNameReturnsBob() {
        Catalog instance = new Catalog();
        instance.setName("Bob");
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescHelloWorldThenGetDescReturnsHelloWorld() {
        Catalog instance = new Catalog();
        instance.setDescription("Hello World");
        String expResult = "Hello World";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQuantity4ThenGetQuantityReturns4() {
        Catalog instance = new Catalog();
        instance.setQuantity(4);
        int expResult = 4;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdZeroThenGetIdReturnsZero() {
        Catalog instance = new Catalog();
        instance.setId(0);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNameEmptyThenGetNameReturnsEmpty() {
        Catalog instance = new Catalog();
        instance.setName("");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescEmptyThenGetDescReturnsEmpty() {
        Catalog instance = new Catalog();
        instance.setDescription("");
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQuantityZeroThenGetQuantityReturnsZero() {
        Catalog instance = new Catalog();
        instance.setQuantity(0);
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdNegative4ThenGetIdReturnsZero() {
        Catalog instance = new Catalog();
        instance.setId(-4);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQuantityNegative4ThenGetQuantityReturnsZero() {
        Catalog instance = new Catalog();
        instance.setQuantity(-4);
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPropertiesThenToStringReturnsJSON() {
        String strJSON = "";
        try {
            Catalog instance = new Catalog();
            instance.setId(1);
            instance.setName("Catalog");
            instance.setDescription("Some item from a catalog.");
            instance.setQuantity(4);
            strJSON = instance.toString();
            JSONObject result = (JSONObject) new JSONParser().parse(strJSON);
            JSONObject expResult = new JSONObject();
            expResult.put("id", 1);
            expResult.put("name", "Catalog");
            expResult.put("description", "Some item from a catalog.");
            expResult.put("quantity", 4);
            assertEquals(expResult.toJSONString(), result.toJSONString());
        } catch (ParseException ex) {
            Logger.getLogger(CatalogTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error Parsing JSON: " + strJSON);
        }
    }

}
