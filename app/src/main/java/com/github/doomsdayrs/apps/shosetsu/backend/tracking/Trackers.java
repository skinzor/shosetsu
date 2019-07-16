package com.github.doomsdayrs.apps.shosetsu.backend.tracking;

import android.content.res.Resources;

import com.github.doomsdayrs.apps.shosetsu.R;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 * Shosetsu
 * 16 / 06 / 2019
 *
 * @author github.com/doomsdayrs
 */
@SuppressWarnings("unused")
public enum Trackers {
    ANILIST(getString(R.string.anilist), 1),
    MYANIMELIST(getString(R.string.myanimelist), 2);
    private final String name;
    private final int id;

    Trackers(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private static String getString(int id) {
        return Resources.getSystem().getString(id);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Trackers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
