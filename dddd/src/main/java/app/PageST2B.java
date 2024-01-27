package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class PageST2B implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/page2B.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Head information
        html = html + "<head>" + 
               "<title>Subtask 2.2</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";
        html = html + """
                     <link rel='stylesheet' type='text/css' href='https://www.w3schools.com/w3css/4/w3.css' />
                     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                      """;
        html = html + "</head>";


        // Add the body 
        html = html + "<body>"  ;

        // Add the topnav
        // This uses a Java v15+ Text Block
        html = html + """
            <div class='topnav'>
            <a href="/" class="logo-container">
            <button class="btn"><i class="fa fa-maxcdn fa-2x"></i></button>
            <span class="logo-text">etaStat</span>
            </a>
                
                <a href='/'>Homepage</a>
                <a href='mission.html'>Our Mission</a>
                <a href='page2A.html'>Sub Task 2.A</a>
                <a href='page2B.html'>Sub Task 2.B</a>
                <a href='page3A.html'>Sub Task 3.A</a>
                <a href='page3B.html'>Sub Task 3.B</a>
            </div>
        """;

        // Add header content block
        html = html + """
                <br>
                <br>
                <div class="radio-group">
                <p class="radio-h3">Search By &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Country Name: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp  Start Year: &nbsp  &nbsp &nbsp &nbsp  &nbsp &nbsp End year:</p>
                <input class="radio-input" name="radio-group" id="radio1" type="radio">
                <label class="radio-label" for="radio1">
                  <span class="radio-inner-circle"></span>
                  World
                </label>
                <input class="radio-input" name="radio-group" id="radio2" type="radio">
                <label class ="radio-label" for ="radio2">
                  <span class="radio-inner-circle"></span>
                  Country
                  </label>
                  </div>
              </form>
              <form>
                  <input type="text" id="search-input" placeholder="Search city...">
                  <button>Search</button>
              </form>
              <form>
                  <input type="number" placeholder="Starting year...">
                  <input type="number" placeholder="Ending year...">
              </form>
              <form>
                  <label for="data-type">Choose Data Type:</label>
                  <select id="data-type">
                      <option value="temperature">Temperature</option>
                      <option value="population">Population</option>
                  </select>
              </form>
              <button>Download data</button>
              <select>
                  <option value="city">City</option>
                  <option value="state">State</option>
              </select>
              <div id="chart"></div>
              <div id="result"></div>
              <script>
                  document.addEventListener('DOMContentLoaded', function() {
                          var selectElement = document.querySelector('select');
                          var inputElement = document.querySelector('#search-input');
                      
                          selectElement.addEventListener('change', function() {
                              if (selectElement.value === 'city') {
                                  inputElement.placeholder = 'Search city...';
                              } else if (selectElement.value === 'state') {
                                  inputElement.placeholder = 'Search state...';
                              }
                          });
                      
                      });
                          </script>
                      </body>
                      </html>
        """;
                    
        html = html + "</div>";
        // Add Div for page Content
        html = html + "<div class='content'>";

        // Add HTML for the page content
        

        // Close Content div
        html = html + "</div>";

        // Footer
        html = html + """
                <br>
                <body>
                   <footer>
                       <div class="footer">
                           <div class="row">
                               <a href="#"><i class="fa fa-facebook"></i></a>
                               <a href="#"><i class="fa fa-instagram"></i></a>
                               <a href="#"><i class="fa fa-youtube"></i></a>
                               <a href="#"><i class="fa fa-twitter"></i></a>
                           </div>
                           <div class="row">
                               <ul>
                                   <li><a href="/">Home</a></li>
                                   <li><a href="mission.html">Our Mission</a></li>
                                   <li><a href="page2A.html">Explore Data</a></li>
                                   <li><a href="page3A.html">Time Series Analysis</a></li>
                                   <li><a href="#">Privacy Policy</a></li>
                                   </ul>
                           </div>

                           <div class="row">
                                Copyright © Metastat | Designed by Dean-S4037889(SG03-G05) - All rights reserved || Powered by SG03-G05 
                           </div>
            """;

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";
        

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
