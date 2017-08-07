package cn.datai.gift.persist.vo;

public class Page {

    /**
     * 当前页
     */
    private int currentIndex;

    private Integer pageNo;

    private Integer size;

    private Integer begin;

    private Integer end;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 总记录数
     */
    private int totalNumber;
    /**
     * 下一页
     */
    private int nextIndex;

    /**
     * 上一页
     */
    private int preIndex;

    public Page(DatatableParam param) {
        this.pageNo = (param.getiDisplayStart() / param.getiDisplayLength())
                + (param.getiDisplayStart() % param.getiDisplayLength() == 0 ? 0 : 1);
        this.size = param.getiDisplayLength();
        this.begin = param.getiDisplayStart();
        this.end = this.begin + this.size;
        this.currentIndex = this.pageNo;
    }

    public Page(Integer pageNo, Integer size, int totolNum) {
        this(false, pageNo, size,totolNum);
    }

    public Page(boolean startZero, int pageNo, int size, int totalNum) {
        this.pageNo = pageNo <= 0 ? 1 : pageNo;
        this.size = size;
        this.begin = (startZero ? 0 : 1) + (this.pageNo - 1) * size;
        this.end = begin + size;
        this.totalNumber = totalNum;
        this.totalPage = getTotalPage();
        this.preIndex = getPreIndex();
        this.nextIndex = getNextIndex();
        this.currentIndex = this.pageNo;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * 当前页的下一页，如果当前耶大于等于最后一页
     * 那么下一页就是最后一页。
     *
     * @return
     */
    public int getNextIndex() {

        if(this.pageNo >= this.totalPage){
            this.nextIndex = this.pageNo;
        }else{
            this.nextIndex = this.pageNo + 1;
        }
        return nextIndex;
    }

    /**
     * 当前页的上一页，如果当前页小于第一页那么上一页为0
     * @return
     */
    public int getPreIndex() {

        if(this.pageNo <= 1){
            this.preIndex = 0;
        }else{
            this.preIndex = this.pageNo -1;
        }

        return preIndex;
    }
    /**
     * 总页数
     * @return
     */
    public int getTotalPage() {

        int size = this.totalNumber/this.size;
        if(this.totalNumber%this.size != 0){
            size = size + 1;
        }
        this.totalPage = size;

        return this.totalPage;
    }

    public int getCurrentIndex()
    {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex)
    {
        this.currentIndex = currentIndex;
    }

}
