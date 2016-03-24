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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <Kirill Suslov>
 */
@WebServlet("/catalog")
public class CatalogServlet extends HttpServlet {

    private CatalogController catalogController = new CatalogController();

    /**
     * The standard Servlet doGet method which runs when a GET request is
     * received
     *
     * @param request the request object for incoming requests
     * @param response the response object for outgoing responses
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // These three lines invalidate the cache, and are required for IE
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        // TODO: Determine if there was an "id" Parameter on the Request
        if (request.getParameterMap().containsKey("id")) {
            // TODO: If there was an "id" parameter, convert it to an Integer and
            //       use the id to call the Controller's getCatalogById method, then
            //       output the Catalog item's JSON to the response object
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                response.getWriter().println(catalogController.getCatalogById(id).toString());
            } catch (NumberFormatException | NullPointerException | IOException e) {
                Logger.getLogger(CatalogServlet.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            // TODO: If there was NOT an "id", then call the Controller's getAll
            //       method to retrieve the list. Iterate through the list to output
            //       a valid JSON array to the response object like:
            //       [{...}, {...}, {...}]
            try {
                PrintWriter output = response.getWriter();
                StringBuilder builder = new StringBuilder();
                builder.append("[");
                for (Catalog c : catalogController.getAll()) {
                    builder.append(c.toString());
                    builder.append(", ");
                }
                builder.delete(builder.length() - 2, builder.length() - 1);
                builder.append("]");
                output.print(builder.toString());
            } catch (IOException ex) {
                Logger.getLogger(CatalogServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
