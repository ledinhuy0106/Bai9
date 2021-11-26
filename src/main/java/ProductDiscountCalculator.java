import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/product")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        String str = request.getParameter("Product");
        int Price = Integer.parseInt(request.getParameter("Price"));
        double Percent = Double.parseDouble(request.getParameter("Discount"));
        double DiscountAmount = Price * Percent * 0.01;
        printWriter.println("Ten san pham: "+str);
        printWriter.println("Gia: "+Price);
        printWriter.println("Luong triet khau: "+DiscountAmount);
        printWriter.println("Sau khi triet khau : "+ (Price-DiscountAmount));
    }
}
