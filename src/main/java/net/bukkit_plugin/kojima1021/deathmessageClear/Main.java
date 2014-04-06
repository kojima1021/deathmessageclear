package net.bukkit_plugin.kojima1021.deathmessageClear;

import net.bukkit_plugin.kojima1021.deathmessageClear.Event.Death;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * CommandLog メインクラス
 * @author kojima1021
 */
public class Main extends JavaPlugin implements Listener{
    //インスタンス
    private static Main instance;
    /**
     * メインクラスを取得します
     * @return instance
     */
    public static Main getInstance(){
        return instance;
    }
    //Plugin開始時
    @Override
    public void onEnable() {
        //リスナー登録
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(
        		new Death(), this);
        //インスタンス設定
        instance = this;
        //コマンド登録
        //起動時のmessage
        getLogger().info("Plugin Ver1.0.0");
	}
	//Pluginun終了時
    @Override
    public void onDisable() {
        getLogger().info("プラグインを正常に終了しました。");
    }
}
