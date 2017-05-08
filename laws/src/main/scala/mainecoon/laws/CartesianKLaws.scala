/*
 * Copyright 2017 Kailuo Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mainecoon
package laws

import cats.data.Prod

trait CartesianKLaws[F[_[_]]] {
  implicit def F: CartesianK[F]

  def cartesianAssociativity[A[_], B[_], C[_]](af: F[A], ag: F[B], ah: F[C]):
  (F[Prod[A, Prod[B, C, ?], ?]], F[Prod[Prod[A, B, ?], C, ?]]) =
    (F.productK(af, F.productK(ag, ah)), F.productK(F.productK(af, ag), ah))

}

object CartesianKLaws {
  def apply[F[_[_]]](implicit ev: CartesianK[F]): CartesianKLaws[F] =
    new CartesianKLaws[F] { val F = ev }
}
