/*
 * Copyright (c) 2020-2021, The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   * Neither the name of The Linux Foundation nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.qti.extphone;

import android.os.RemoteException;
import android.util.Log;
import com.qti.extphone.IExtPhoneCallback;
import com.qti.extphone.Status;
import com.qti.extphone.Token;
import com.qti.extphone.NrConfig;
import com.qti.extphone.NrIconType;

public class ExtPhoneCallbackBase extends IExtPhoneCallback.Stub {
    private static final String TAG = "ExtPhoneCallbackBase";

    @Override
    public void onNrIconType(int slotId, Token token, Status status, NrIconType
            nrIconType) throws RemoteException {
        Log.d(TAG,
                "onNrIconType: slotId = " + slotId + " token = " + token + " " + "status"
                        + status + " NrIconType = " + nrIconType);
    }

    @Override
    public void onEnableEndc(int slotId, Token token, Status status) throws
            RemoteException {
        Log.d(TAG,
                "onEnableEndc: slotId = " + slotId + " token = " + token + " " + "status" +
                        status);
    }

    @Override
    public void onEndcStatus(int slotId, Token token, Status status, boolean enableStatus) throws
            RemoteException {
        Log.d(TAG,
                "onEndcStatus: slotId = " + slotId + " token = " + token + " " + "status" +
                        status + " enableStatus = " + enableStatus);
    }

    @Override
    public void onSetNrConfig(int slotId, Token token, Status status) throws
            RemoteException {
        Log.d(TAG, "onSetNrConfig: slotId = " + slotId + " token = " + token + " status" +
                status);
    }

    @Override
    public void onNrConfigStatus(int slotId, Token token, Status status, NrConfig nrConfig) throws
            RemoteException {
        Log.d(TAG, "onNrConfigStatus: slotId = " + slotId + " token = " + token + " status" +
                status + " NrConfig = " + nrConfig);
    }

}
