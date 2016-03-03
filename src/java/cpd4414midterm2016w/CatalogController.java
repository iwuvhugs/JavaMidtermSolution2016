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

/**
 *
 * @author <ENTER YOUR NAME HERE>
 */
public class CatalogController {
    // TODO: Create a private List of Catalog objects as an instance variable

    /**
     * Public no-arg constructor - automatically pulls contents from database
     */
    public CatalogController() {
        // TODO: Connect to the database and query the DB for all items in the
        //       Catalog table. Iterate through the results to build the List
        //       of Catalog objects and assign it to the private List instance
    }

    /**
     * Method to retrieve a single Catalog Item by its ID
     * @param id the ID being searched for
     * @return the Catalog object which matches the ID - returns null if not found
     */
    public Catalog getCatalogById(int id) {
        // TODO: Search through the private List of Catalog items to find a
        //       single Catalog item that has the matching ID and return it
        return null;
    }

    /**
     * Method to retrieve the entire List of Catalog Items
     * @return the List of Catalog items
     */
    public List<Catalog> getAll() {
        // TODO: Return the entire List of Catalog items
        return null;
    }
}
