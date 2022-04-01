//
// Copyright 2021 The Sigstore Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package dev.sigstore.plugin.model;

import java.util.List;

public class HashedRekordRequest
{
  public List<String> entryUUIDs;

  public HashedRekordRequest(final List<String> entryUUIDs) {
    this.entryUUIDs = entryUUIDs;
  }

  @Override
  public String toString() {
    return "HashedRekordRequest{" +
        "entryUUIDs=" + entryUUIDs +
        '}';
  }
}
