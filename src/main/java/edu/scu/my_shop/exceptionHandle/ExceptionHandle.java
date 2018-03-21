package edu.scu.my_shop.exceptionHandle;

import edu.scu.my_shop.exception.*;
import edu.scu.my_shop.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理
 */
@ControllerAdvice
public class ExceptionHandle {

    /**
     * 注册相关的异常处理
     * @param reg
     * @param e
     * @return
     */
    @ExceptionHandler(RegisterException.class)
    public ModelAndView handleRigesterException(HttpServletRequest reg, RegisterException e){

        ModelAndView mav = new ModelAndView();
        mav.getModelMap().addAttribute("error",e.getMessage());//携带属性
        mav.setViewName("signup");//返回页面
        return mav;
    }

    /**
     * 改变用户信息相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(ChangeUserInfoException.class)
    public String handleChangeUserInfoException(HttpServletRequest request, ChangeUserInfoException e){

        return null;
    }

    /**
     * 文件上传相关的异常处理
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(FileException.class)
    public String handleFileException(HttpServletRequest request, FileException e){

        return null;
    }

    /**
     * 处理用户管理相关的异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(ManageUserException.class)
    public String handleManageUserException(HttpServletRequest request, ManageUserException e){

        return null;
    }

    /**
     * 处理商品相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(ProductException.class)
    public String handleProductException(HttpServletRequest request, ProductException e){
        return null;
    }

    /**
     * 处理购物车相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(CartException.class)
    public String handleCartException(HttpServletRequest request, ProductException e) {
        return null;
    }

    /**
     * 处理订单相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(OrderServiceException.class)
    public String handleOrderServiceException(HttpServletRequest request,OrderServiceException e){
        return null;
    }

    /**
     * 处理商品相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(AddressException.class)
    public String handleAddressException(HttpServletRequest request, AddressException e) {
        return null;
    }

    /**
     * 处理消息相关异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(MessageException.class)
    public String handleMessageException(HttpServletRequest request, MessageException e) {
        return null;
    }

     /**
     * 处理分类相关的异常
     * @param request
     * @param e
     * @return
     */
    public String handleCategoryServiceException(HttpServletRequest request,CategoryServiceException e){
 
        return null;
    }

    /**
     * 处理评论相关的异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(CommentException.class)
    public String handleCommentException(HttpServletRequest request, CommentException e) {
        return null;
    }
}
