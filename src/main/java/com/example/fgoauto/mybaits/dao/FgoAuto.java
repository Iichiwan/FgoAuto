package com.example.fgoauto.mybaits.dao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class FgoAuto implements Serializable {

    private static final long serialVersionUID = 1666521345743L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime gmtCreate;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime gmtModified;

    /**
    * 创建者
    * isNullAble:1
    */
    private String creator;

    /**
    * 脚本内容
    * isNullAble:1
    */
    private String script;

    /**
    * 预留字段
    * isNullAble:1
    */
    private String ext;

    /**
    * 脚本名
    * isNullAble:1
    */
    private String name;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setGmtCreate(java.time.LocalDateTime gmtCreate){this.gmtCreate = gmtCreate;}

    public java.time.LocalDateTime getGmtCreate(){return this.gmtCreate;}

    public void setGmtModified(java.time.LocalDateTime gmtModified){this.gmtModified = gmtModified;}

    public java.time.LocalDateTime getGmtModified(){return this.gmtModified;}

    public void setCreator(String creator){this.creator = creator;}

    public String getCreator(){return this.creator;}

    public void setScript(String script){this.script = script;}

    public String getScript(){return this.script;}

    public void setExt(String ext){this.ext = ext;}

    public String getExt(){return this.ext;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}
    @Override
    public String toString() {
        return "FgoAuto{" +
                "id='" + id + '\'' +
                "gmtCreate='" + gmtCreate + '\'' +
                "gmtModified='" + gmtModified + '\'' +
                "creator='" + creator + '\'' +
                "script='" + script + '\'' +
                "ext='" + ext + '\'' +
                "name='" + name + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private FgoAuto set;

        private ConditionBuilder where;

        public UpdateBuilder set(FgoAuto set){
            this.set = set;
            return this;
        }

        public FgoAuto getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends FgoAuto{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> creatorList;

        public List<String> getCreatorList(){return this.creatorList;}


        private List<String> fuzzyCreator;

        public List<String> getFuzzyCreator(){return this.fuzzyCreator;}

        private List<String> rightFuzzyCreator;

        public List<String> getRightFuzzyCreator(){return this.rightFuzzyCreator;}
        private List<String> scriptList;

        public List<String> getScriptList(){return this.scriptList;}


        private List<String> fuzzyScript;

        public List<String> getFuzzyScript(){return this.fuzzyScript;}

        private List<String> rightFuzzyScript;

        public List<String> getRightFuzzyScript(){return this.rightFuzzyScript;}
        private List<String> extList;

        public List<String> getExtList(){return this.extList;}


        private List<String> fuzzyExt;

        public List<String> getFuzzyExt(){return this.fuzzyExt;}

        private List<String> rightFuzzyExt;

        public List<String> getRightFuzzyExt(){return this.rightFuzzyExt;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public QueryBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public QueryBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public QueryBuilder gmtCreate(java.time.LocalDateTime gmtCreate){
            setGmtCreate(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public QueryBuilder fetchGmtCreate(){
            setFetchFields("fetchFields","gmtCreate");
            return this;
        }

        public QueryBuilder excludeGmtCreate(){
            setFetchFields("excludeFields","gmtCreate");
            return this;
        }

        public QueryBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public QueryBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public QueryBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public QueryBuilder gmtModified(java.time.LocalDateTime gmtModified){
            setGmtModified(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public QueryBuilder fetchGmtModified(){
            setFetchFields("fetchFields","gmtModified");
            return this;
        }

        public QueryBuilder excludeGmtModified(){
            setFetchFields("excludeFields","gmtModified");
            return this;
        }

        public QueryBuilder fuzzyCreator (List<String> fuzzyCreator){
            this.fuzzyCreator = fuzzyCreator;
            return this;
        }

        public QueryBuilder fuzzyCreator (String ... fuzzyCreator){
            this.fuzzyCreator = solveNullList(fuzzyCreator);
            return this;
        }

        public QueryBuilder rightFuzzyCreator (List<String> rightFuzzyCreator){
            this.rightFuzzyCreator = rightFuzzyCreator;
            return this;
        }

        public QueryBuilder rightFuzzyCreator (String ... rightFuzzyCreator){
            this.rightFuzzyCreator = solveNullList(rightFuzzyCreator);
            return this;
        }

        public QueryBuilder creator(String creator){
            setCreator(creator);
            return this;
        }

        public QueryBuilder creatorList(String ... creator){
            this.creatorList = solveNullList(creator);
            return this;
        }

        public QueryBuilder creatorList(List<String> creator){
            this.creatorList = creator;
            return this;
        }

        public QueryBuilder fetchCreator(){
            setFetchFields("fetchFields","creator");
            return this;
        }

        public QueryBuilder excludeCreator(){
            setFetchFields("excludeFields","creator");
            return this;
        }

        public QueryBuilder fuzzyScript (List<String> fuzzyScript){
            this.fuzzyScript = fuzzyScript;
            return this;
        }

        public QueryBuilder fuzzyScript (String ... fuzzyScript){
            this.fuzzyScript = solveNullList(fuzzyScript);
            return this;
        }

        public QueryBuilder rightFuzzyScript (List<String> rightFuzzyScript){
            this.rightFuzzyScript = rightFuzzyScript;
            return this;
        }

        public QueryBuilder rightFuzzyScript (String ... rightFuzzyScript){
            this.rightFuzzyScript = solveNullList(rightFuzzyScript);
            return this;
        }

        public QueryBuilder script(String script){
            setScript(script);
            return this;
        }

        public QueryBuilder scriptList(String ... script){
            this.scriptList = solveNullList(script);
            return this;
        }

        public QueryBuilder scriptList(List<String> script){
            this.scriptList = script;
            return this;
        }

        public QueryBuilder fetchScript(){
            setFetchFields("fetchFields","script");
            return this;
        }

        public QueryBuilder excludeScript(){
            setFetchFields("excludeFields","script");
            return this;
        }

        public QueryBuilder fuzzyExt (List<String> fuzzyExt){
            this.fuzzyExt = fuzzyExt;
            return this;
        }

        public QueryBuilder fuzzyExt (String ... fuzzyExt){
            this.fuzzyExt = solveNullList(fuzzyExt);
            return this;
        }

        public QueryBuilder rightFuzzyExt (List<String> rightFuzzyExt){
            this.rightFuzzyExt = rightFuzzyExt;
            return this;
        }

        public QueryBuilder rightFuzzyExt (String ... rightFuzzyExt){
            this.rightFuzzyExt = solveNullList(rightFuzzyExt);
            return this;
        }

        public QueryBuilder ext(String ext){
            setExt(ext);
            return this;
        }

        public QueryBuilder extList(String ... ext){
            this.extList = solveNullList(ext);
            return this;
        }

        public QueryBuilder extList(List<String> ext){
            this.extList = ext;
            return this;
        }

        public QueryBuilder fetchExt(){
            setFetchFields("fetchFields","ext");
            return this;
        }

        public QueryBuilder excludeExt(){
            setFetchFields("excludeFields","ext");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public FgoAuto build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> creatorList;

        public List<String> getCreatorList(){return this.creatorList;}


        private List<String> fuzzyCreator;

        public List<String> getFuzzyCreator(){return this.fuzzyCreator;}

        private List<String> rightFuzzyCreator;

        public List<String> getRightFuzzyCreator(){return this.rightFuzzyCreator;}
        private List<String> scriptList;

        public List<String> getScriptList(){return this.scriptList;}


        private List<String> fuzzyScript;

        public List<String> getFuzzyScript(){return this.fuzzyScript;}

        private List<String> rightFuzzyScript;

        public List<String> getRightFuzzyScript(){return this.rightFuzzyScript;}
        private List<String> extList;

        public List<String> getExtList(){return this.extList;}


        private List<String> fuzzyExt;

        public List<String> getFuzzyExt(){return this.fuzzyExt;}

        private List<String> rightFuzzyExt;

        public List<String> getRightFuzzyExt(){return this.rightFuzzyExt;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}

        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public ConditionBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public ConditionBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public ConditionBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public ConditionBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public ConditionBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public ConditionBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public ConditionBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public ConditionBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public ConditionBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public ConditionBuilder fuzzyCreator (List<String> fuzzyCreator){
            this.fuzzyCreator = fuzzyCreator;
            return this;
        }

        public ConditionBuilder fuzzyCreator (String ... fuzzyCreator){
            this.fuzzyCreator = solveNullList(fuzzyCreator);
            return this;
        }

        public ConditionBuilder rightFuzzyCreator (List<String> rightFuzzyCreator){
            this.rightFuzzyCreator = rightFuzzyCreator;
            return this;
        }

        public ConditionBuilder rightFuzzyCreator (String ... rightFuzzyCreator){
            this.rightFuzzyCreator = solveNullList(rightFuzzyCreator);
            return this;
        }

        public ConditionBuilder creatorList(String ... creator){
            this.creatorList = solveNullList(creator);
            return this;
        }

        public ConditionBuilder creatorList(List<String> creator){
            this.creatorList = creator;
            return this;
        }

        public ConditionBuilder fuzzyScript (List<String> fuzzyScript){
            this.fuzzyScript = fuzzyScript;
            return this;
        }

        public ConditionBuilder fuzzyScript (String ... fuzzyScript){
            this.fuzzyScript = solveNullList(fuzzyScript);
            return this;
        }

        public ConditionBuilder rightFuzzyScript (List<String> rightFuzzyScript){
            this.rightFuzzyScript = rightFuzzyScript;
            return this;
        }

        public ConditionBuilder rightFuzzyScript (String ... rightFuzzyScript){
            this.rightFuzzyScript = solveNullList(rightFuzzyScript);
            return this;
        }

        public ConditionBuilder scriptList(String ... script){
            this.scriptList = solveNullList(script);
            return this;
        }

        public ConditionBuilder scriptList(List<String> script){
            this.scriptList = script;
            return this;
        }

        public ConditionBuilder fuzzyExt (List<String> fuzzyExt){
            this.fuzzyExt = fuzzyExt;
            return this;
        }

        public ConditionBuilder fuzzyExt (String ... fuzzyExt){
            this.fuzzyExt = solveNullList(fuzzyExt);
            return this;
        }

        public ConditionBuilder rightFuzzyExt (List<String> rightFuzzyExt){
            this.rightFuzzyExt = rightFuzzyExt;
            return this;
        }

        public ConditionBuilder rightFuzzyExt (String ... rightFuzzyExt){
            this.rightFuzzyExt = solveNullList(rightFuzzyExt);
            return this;
        }

        public ConditionBuilder extList(String ... ext){
            this.extList = solveNullList(ext);
            return this;
        }

        public ConditionBuilder extList(List<String> ext){
            this.extList = ext;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private FgoAuto obj;

        public Builder(){
            this.obj = new FgoAuto();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder gmtCreate(java.time.LocalDateTime gmtCreate){
            this.obj.setGmtCreate(gmtCreate);
            return this;
        }
        public Builder gmtModified(java.time.LocalDateTime gmtModified){
            this.obj.setGmtModified(gmtModified);
            return this;
        }
        public Builder creator(String creator){
            this.obj.setCreator(creator);
            return this;
        }
        public Builder script(String script){
            this.obj.setScript(script);
            return this;
        }
        public Builder ext(String ext){
            this.obj.setExt(ext);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public FgoAuto build(){return obj;}
    }

}
