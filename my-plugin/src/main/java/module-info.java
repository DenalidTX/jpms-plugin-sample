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

import com.denalidtx.samples.jpms.plugin.HowdyMessageProvider;
import com.denalidtx.samples.jpms.pluginreader.plugininterface.MessageProvider;

module my.plugin
{
    /*
     * This 'requires' statement indicates that the plugin depends on the plugin reader module.
     * Because the plugin reader exports the package that contains MessageProvider, this plugin
     * module will gain access to that interface.
     */
    requires jpms.plugin.reader;
    /*
     * This 'provides...with' statement indicates that this module will act as a service
     * provider. The 'service' is our implementation of the MessageProvider interface.
     */
    provides MessageProvider with HowdyMessageProvider;
}