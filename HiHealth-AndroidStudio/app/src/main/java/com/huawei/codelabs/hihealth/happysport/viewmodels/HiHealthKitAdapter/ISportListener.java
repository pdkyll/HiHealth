package com.huawei.codelabs.hihealth.happysport.viewmodels.HiHealthKitAdapter;


import androidx.annotation.NonNull;

public interface ISportListener extends ISportAction, IConnection {
    String getSportType();

    void onRecvData(@NonNull BaseSportData data);
}
