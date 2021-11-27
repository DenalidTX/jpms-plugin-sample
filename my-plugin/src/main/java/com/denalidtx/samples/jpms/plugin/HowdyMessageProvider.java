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

package com.denalidtx.samples.jpms.plugin;

import com.denalidtx.samples.jpms.pluginreader.plugininterface.MessageProvider;

/**
 * This class provides a MessageProvider implementation via JPMS. This makes it
 * a "service provider", which is what allows us to use this module as a plugin
 * without the main app knowing about this module.
 */
public class HowdyMessageProvider implements MessageProvider
{
    /**
     * Get a message for the provided recipient. This is a
     * variation of "Hello World", but every plugin can act
     * slightly differently.
     *
     * @param recipient The recipient of the message.
     * @return The message, customized for the recipient.
     */
    @Override
    public String getMessage(String recipient)
    {
        return "Howdy, " + recipient;
    }
}
