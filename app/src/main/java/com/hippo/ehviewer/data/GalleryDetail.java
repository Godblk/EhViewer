/*
 * Copyright (C) 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.data;

import java.util.List;

public class GalleryDetail extends GalleryInfo {

    public String thumb;
    public String title;
    public String titleJpn;
    public int category;
    public String uploader;

    public int torrentCount;
    public String torrentUrl;

    public String posted;
    public String parent;
    public String visible;
    public String language;
    public String size;
    public String resize;
    public int pageCount;
    public int favoredTimes;
    public boolean isFavored;
    public float rating;
    public int ratedTimes;

    public List<TagGroup> tags;
    public List<Comment> comments;

    public int previewPageCount;

}
