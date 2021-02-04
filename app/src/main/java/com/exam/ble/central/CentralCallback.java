package com.exam.ble.central;

import android.bluetooth.le.ScanResult;

import java.util.List;

public interface CentralCallback {

    void requestEnableBLE();

    void requestLocationPermission();

    void onStatusMsg(final String message);
    void onStatusMsg(final String addr, final String name);

    void onStatusMsg(final List<ScanResult> _results);
    void onStatusMsg(final ScanResult _result);



    void onToast(final String message);
}
