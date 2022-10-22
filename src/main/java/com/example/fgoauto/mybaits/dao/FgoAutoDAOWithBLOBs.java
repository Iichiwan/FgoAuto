package com.example.fgoauto.mybaits.dao;

public class FgoAutoDAOWithBLOBs extends FgoAutoDAO {
    private String script;

    private String ext;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}