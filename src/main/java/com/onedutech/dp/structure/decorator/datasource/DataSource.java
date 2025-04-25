package com.onedutech.dp.structure.decorator.datasource;

public interface DataSource {
    void writeData(String data);

    String readData();
}
