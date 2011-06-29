/* Copyright (c) 2011 Philippe Bernard
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
package net.pbernard.android.gravatar;

public class GravatarAPITest extends GravatarTest {

	public void testHash() {
		assertEquals("0bc83cb571cd1c50ba6f3e8a78ef1346",
				GravatarAPI.getHash("MyEmailAddress@example.com"));
		assertEquals("0bc83cb571cd1c50ba6f3e8a78ef1346",
				GravatarAPI.getHash("   MyEmailAddress@example.com  "));
	}

	public void testGetGravatarURL() {
		assertEquals(
				"http://www.gravatar.com/avatar/0bc83cb571cd1c50ba6f3e8a78ef1346",
				GravatarAPI.getAvatarURL("MyEmailAddress@example.com"));
	}

	public void testBytesToString() {
		assertEquals(
				"01ab0f9c00",
				GravatarAPI.bytesToString(new byte[] { (byte) 0x01,
						(byte) 0xAB, (byte) 0x0F, (byte) 0x9C, (byte) 0x00 }));
	}
}
