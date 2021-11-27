/*
 * This software has been provided to provide sample code and to aid
 * the software engineering community. It is published under the MIT
 * license. You are welcome to use the code, but please do not take
 * credit for my work.
 *
 * Author: DenalidTX
 * Twitter: @DenalidTX
 * Twitch: https://www.twitch.tv/denalidtx
 */

package com.denalidtx.samples.jpms.pluginreader.plugininterface;

/**
 * This interface provides a means for plugins to add functionality to the
 * main application. The interface will be exported and used via the app's
 * module-info.java file, and the app itself will request all available
 * implementations of the interface at runtime.
 */
public interface MessageProvider
{
    /**
     * Get a message for the provided recipient. This is a
     * variation of "Hello World", but every plugin can act
     * slightly differently.
     *
     * @param recipient The recipient of the message.
     * @return The message, customized for the recipient.
     */
    String getMessage(String recipient);
}
