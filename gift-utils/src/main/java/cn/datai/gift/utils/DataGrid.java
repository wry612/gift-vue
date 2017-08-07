package cn.datai.gift.utils;

import java.util.List;

/**
 * 列表对象类(一般适用于EasyUI).
 *
 */
public class DataGrid extends BaseEntity {
	private static final long serialVersionUID = 1320486747331069304L;
	/** 成功. */
    public static final int SUCCESS = 1;
    /** 无需处理. */
    public static final int NONE = 2;
    /** 账户超时. */
    public static final int TIMEOUT = 3;
    /** 异常或失败. */
    public static final int ERR = 9;

    /** 总数量. */
    private int total;
    /** 每页显示数量. */
    private int pageSize;
    /** 当前页. */
    private int pageNumber;
    /** 检索结果列表. */
	private List<?> rows;

    /** 响应码. */
    private int retCode;
    /** 响应消息. */
    private String retMsg;

    /**
     * 构造方法.
     * @param retCode 返回Code
     * @param retMsg 返回Message
     */
    public DataGrid(int retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    /**
     * 构造方法.
     * @param total 总记录数
     * @param rows 数据记录
     * @param retCode 返回Code
     * @param retMsg 返回Message
     */
    public DataGrid(int total, List<?> rows, int retCode, String retMsg) {
        this.total = total;
        this.rows = rows;
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

	/**
	 * 构造方法.
	 * @param total 总记录数
	 * @param rows 数据记录
	 */
	public DataGrid(int total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}

	/**
	 * 构造方法.
	 * @param rows 数据记录
	 */
	public DataGrid(List<?> rows) {
		this.rows = rows;
	}

    /**
     * 获得总记录数.
     * @return 总记录数
     */
    public int getTotal() {
        return total;
    }

    /**
     * 设置总记录数.
     * @param 总记录数
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 获得每页数据展示数.
     * @return 每页数据展示数
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页数据展示数.
     * @param pageSize 每页数据展示数
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得展示的页号.
     * @return 展示的页号
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * 设置展示的页号.
     * @param pageNumber 展示的页号
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * 获得展示数据.
     * @return 展示数据
     */
    public List<?> getRows() {
        return rows;
    }

    /**
     * 设置展示数据.
     * @param rows 展示数据
     */
    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    /**
     * 获得总页数.
     * @return 总页数
     */
    public int getPageCnt() {
        if (0 >= pageSize || 0 >= total) {
            return 0;
        }
        return (0 == total % pageSize) ? (total / pageSize) : (total / pageSize + 1);
    }

    /**
     * 获得响应码.
     * @return 响应码
     */
    public int getRetCode() {
        return retCode;
    }

    /**
     * 设置响应码.
     * @param retCode 响应码
     */
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    /**
     * 获得响应消息.
     * @return 响应消息
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * 设置响应消息.
     * @param retMsg 响应消息
     */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
