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

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <ENTER YOUR NAME HERE>
 */
@WebServlet("/catalog")
public class CatalogServlet extends HttpServlet {
    // TODO: Create an instance of the CatalogController class to use in doGet
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // TODO: Determine if there was an "id" Parameter on the Request

        // TODO: If there was an "id" parameter, convert it to an Integer and
        //       use the id to call the Controller's getCatalogById method, then
        //       output the Catalog item's JSON to the response object
        
        // TODO: If there was NOT an "id", then call the Controller's getAll
        //       method to retrieve the list. Iterate through the list to output
        //       a valid JSON array to the response object like:
        //       [{...}, {...}, {...}]
    }
}