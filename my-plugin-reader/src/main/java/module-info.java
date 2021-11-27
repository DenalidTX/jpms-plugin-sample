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

import com.denalidtx.samples.jpms.pluginreader.plugininterface.MessageProvider;

module jpms.plugin.reader
{
    /*
     * This 'uses' statement indicates that the module will look for service providers
     * which  satisfy the MessageProvider interface. (This could also be an abstract
     * class.)
     */
    uses MessageProvider;

    /*
     * This 'exports' statement allows the plugins to access the MessageProvider
     * interface so that they can provide implementations.
     */
    exports com.denalidtx.samples.jpms.pluginreader.plugininterface;
}