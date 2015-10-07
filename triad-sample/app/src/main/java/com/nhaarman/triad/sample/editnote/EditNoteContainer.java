/*
 * Copyright 2015 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nhaarman.triad.sample.editnote;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.nhaarman.triad.Container;
import com.nhaarman.triad.sample.ActivityComponent;

public interface EditNoteContainer extends Container<ActivityComponent> {

  @NonNull
  String getTitle();

  void setTitle(@NonNull String title);

  @NonNull
  String getContents();

  void setContents(@NonNull String contents);

  void setTitleError(@Nullable String message);

  void setContentsError(@Nullable String message);
}
