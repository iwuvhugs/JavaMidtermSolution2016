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

import org.json.simple.JSONObject;

/**
 *
 * @author <Kirill Suslov>
 */
public class Catalog {

    private int id;
    private String name;
    private String description;
    private int quantity;

    // TODO: Build the Getters and Setters for this Model Class
    // TODO: Build a toString method that returns a JSON String of the form:
    //   { "id" : XXX, "name" : "XXX", "description" : "XXX", "quantity" : XXX }
    /**
     * Method returns catalog id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method sets catalog id
     *
     * @param id
     */
    public void setId(int id) {
        if (id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    /**
     * Method returns catalog name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method sets catalog name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method returns catalog description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method sets catalog description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method returns catalog quantity
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Method sets catalog quantity
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    /**
     * Method returns catalog as Json string
     *
     * @return json
     */
    @Override
    public String toString() {

        JSONObject jsonCatalog = new JSONObject();
        jsonCatalog.put("id", id);
        jsonCatalog.put("name", name);
        jsonCatalog.put("description", description);
        jsonCatalog.put("quantity", quantity);

        return jsonCatalog.toJSONString(); 
    }

}
