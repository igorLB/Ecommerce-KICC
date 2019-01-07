package Controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.URL;
import java.net.URLConnection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author igorc, cristiano, kaleb, coppula
 */


@WebServlet("/pesquisa")
public class PesquisaServlet extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resultados.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pesquisa = (String) request.getParameter("pesquisa");
        String filtro = (String) request.getParameter("filtro");

        
            String sURL = "http://localhost:8080/WSKICC/webresources/produtos/buscar/" + pesquisa;

            URL url = new URL(sURL);
            URLConnection requestjson = url.openConnection();
            requestjson.connect();

            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) requestjson.getContent())); //Convert the input stream to a json element

            JsonArray jarray = root.getAsJsonArray();

            out.println(jarray);
            
            
        

    }

}
