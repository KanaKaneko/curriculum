package controller;
 
/**
 * 社員情報管理コントローラー
全ての情報の受信送信
 */
 
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;
import service.EmployeeService;

/*サーブレットを作成する上で必要となるクラスは「javax.servlet.http」に含まれている
 * 作成するクラスをサーブレットとして定義するためには、HttpServletクラスを継承する必要がある
 * */

public class EmployeeController extends HttpServlet {
 @Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
//doPost:入力内容がURLに載らない
//https://takarogu.com/http-get-post/
 
 try {
  // 問① index.htmlから送信されたIDとPassWordの値を取得できるように修正しましょう。
 String id = request.getParameter("id");
 String password = request.getParameter("pass");
// 入力値をリクエストスコープから取得して変数に格納
//https://takarogu.com/java-requestscope/

 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */
 
  // 問② EmployeeServiceクラスをインスタンス化する。
 EmployeeService a = new EmployeeService(); 
 
  // 問③ EmployeeBeanに、EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
 EmployeeBean b =a.search(id, password);
 
  // 問④ nullの部分に適切な引数をセットする。
 request.setAttribute("EmployeeBean", b);
 //setAttributeで特定の名前(EmployBean)を目印に値を格納
// リクエストスコープに変数から取出した値を格納
 
 } catch (Exception e) {
 e.printStackTrace();
 } finally {
//jspに接続
 ServletContext context = this.getServletContext();
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
// 送信先の決定。
 dispatcher.forward(request, response);
// forwardメソッドを使って送信
 }
 }
}