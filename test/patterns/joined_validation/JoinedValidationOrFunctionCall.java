// SPDX-FileCopyrightText: Copyright (c) 2019-2025 Aibolit
// SPDX-License-Identifier: MIT

class JoinedValidationAndOr {

    int fun() {
        return 0;
    }

    void print(int x, int y) {
        if (x == 1 || this.fun() == 1) {
            throw new Exception("Oops");
        }
    }
}
