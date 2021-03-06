/*
 * android-spackle https://github.com/twofortyfouram/android-spackle
 * Copyright (C) 2009–2017 two forty four a.m. LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.twofortyfouram.spackle;


import android.os.SystemClock;
import android.support.annotation.NonNull;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public final class ClockImpl implements IClock {

    @NonNull
    private static final IClock CLOCK = new ClockImpl();

    /**
     * @return Singleton instance of a clock based on the Android clock facilities.
     */
    @NonNull
    public static IClock getInstance() {
        return CLOCK;
    }

    /**
     * @return {@link System#currentTimeMillis()}
     */
    @Override
    public long getWallTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * @return {@link SystemClock#elapsedRealtime()}.
     */
    @Override
    public long getRealTimeMillis() {
        return SystemClock.elapsedRealtime();
    }
}
