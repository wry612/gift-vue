package cn.datai.gift.persist.vo;
/**
 * @description
 * @author H.CAAHN
 */
public class DatatableParam {
    private int    iDisplayStart;
    
    private int    iDisplayLength;
    
    private String sSearch;
    
    public int getiDisplayStart() {
        return iDisplayStart;
    }
    
    public void setiDisplayStart(int iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }
    
    public int getiDisplayLength() {
        return iDisplayLength;
    }
    
    public void setiDisplayLength(int iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }
    
    public String getsSearch() {
        return sSearch;
    }
    
    public void setsSearch(String sSearch) {
        this.sSearch = sSearch;
    }
}
