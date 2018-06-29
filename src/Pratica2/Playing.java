/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica2;


import Abstratas.*;
import Enimigos.*;
import Ataques.*;
import Poderes.*;
import Fabricas.*;
import Labirinto.*;
import Interfaces.*;
import com.jme3.animation.AnimChannel;
import com.jme3.animation.AnimControl;
import com.jme3.animation.AnimEventListener;
import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;



/**
 *
 * @author a11521BSI249
 */
public class Playing extends SimpleApplication implements AnimEventListener
{
  private AnimChannel channel;
  private AnimControl control;
  Node player;
    public static void main(String[] args) 
    {  
        Playing app = new Playing();
        app.start();
        
        Enemy e1 = new Enemy1(0,0,new PoderTerra(new AtaqueForte()));
        Enemy e2 = new Enemy2(15,20,new PoderFogo(new AtaqueFraco()));
        Enemy e3 = new Enemy3(5,5,new PoderAgua(new AtaqueMedio()));
        Enemy e4 = new Enemy4(1,5,new AtaqueForte());
        
        System.out.println("---------Labirinto---------- \n");
        
                
        Component labirinto = new Sala(
                              new Sala(new Abismo(), new Saida(),"sala2",e2),
                              new Sala(new Abismo(), new Saida(),"sala3",e3), "Sala1",e1);
        
        // fazer uma fabrica... 
        
        labirinto.andar(new Personagem1(8,6,"Janelle Monae"));
        
        Jogar j  = new Jogar(labirinto,new Personagem1(8,6,"Janelle Monae"));
        j.run();
        
        
        Thread t1 = new Thread(new Jogar(labirinto,new Personagem1(8,6,"Janelle Monae")));
        Thread t2 = new Thread(new Jogar(labirinto,new Personagem2(0,0,"Brian Wilson")));
        Thread t3 = new Thread(new Jogar(labirinto,new Personagem5(7,9,"Dr.Dre")));
        
        t1.start();
        t2.start();
        t3.start();
         
        
        SimpleFactory s = SimpleFactory.getInstancia();
        AdvancedFactory d = AdvancedFactory.getInstancia();
        
        MedievalFactory m = MedievalFactory.getInstancia();
        FuturistaFactory f = FuturistaFactory.getInstancia();

        System.out.println("---------Personagem Futurista---------- \n");
        Personagem fu = f.createPersonagem();
        
        fu.receberAtaque(e1.getAtaque());
        
        
        System.out.println("---------Personagem Medieval---------- \n ");
        Personagem me = m.createPersonagem();
        me.receberAtaque(e3.getAtaque());
        
        System.out.println("---------Personagem simples---------- \n ");
        
        Personagem per = s.createPersonagem();
          
        System.out.println("------------Personagem avançado------------- ");
        Personagem per2 = d.createPersonagem();
        
        
        System.out.println("------------Personagem Pedido------------- \n");
        
        System.out.println("\n------------Joysitick------------- \n");
        
        CommandFactory cm = CommandFactory.getInvoker();
        cm.createJoystick(new Personagem1(8,0,"Janelle Monae"));
        
        System.out.println("\n------------Fim - Joysitick------------- \n");
        
        //PersonagemSimpleStore()
     /*   
        System.out.println("Personagem simples ");
        
        // versao estatica 
        
        //SimpleFactory.createPersonagem();
        
        // se o meotod cria persnagem na fabirca nao for estatico ha uma 
        //felxibilidade para criar mais fabricas e masi persnagens
        
        // versao caso nao fosse estatica ..
        SimpleFactory f = new SimpleFactory();
        
        PersonagemStore s = new PersonagemStore(f);
        s.OrderPersonagem();
        
        System.out.println("Personagem avançado ");
        
        //ciando personagem via metodo estatico chamado somente pela classe
     //   AdvancedFactory.createPersonagemAdvanced();
        
      */  
        
     
      
        Personagem1 p1 = new Personagem1(9,0,"Janelle Monae");        
        p1.receberAtaque(e1.getAtaque());
                      
        Personagem2 p2 = new Personagem2(0,8, "Brian Wilson");        
        p2.receberAtaque(e2.getAtaque());
        
        Personagem3 p3 = new Personagem3(3,7,"Gwen Stefani");
        p3.receberAtaque(e3.getAtaque());
      
        
        
        p1.registerObserver(e3);
        p2.registerObserver(e1);
        p3.registerObserver(e2);  
        p3.registerObserver(e4);
        
              
     //  while(true)
     //  {
          /// if(p1.getVida() < 0 && p2.getVida() < 0 && p3.getVida() < 0 )
          // {
           
          //     System.out.println("\n ------ All These Guys Are Dead ---------  ");
            //   break;
           
           //}
           p1.show();

          p2.show();

          p3.show();
           // Thread.sleep(200);
     //  }    
        
    }
    
      @Override
  public void simpleInitApp()
  {
    viewPort.setBackgroundColor(ColorRGBA.LightGray);
    initKeys();
    DirectionalLight dl = new DirectionalLight();
    dl.setDirection(new Vector3f(-0.1f, -1f, -1).normalizeLocal());
    rootNode.addLight(dl);
    player = (Node) assetManager.loadModel("Models/Oto/Oto.mesh.xml");
    player.setLocalScale(0.5f);
    rootNode.attachChild(player);
    control = player.getControl(AnimControl.class);
    control.addListener(this);
    channel = control.createChannel();
    channel.setAnim("stand");
  }
  
   public void onAnimCycleDone(AnimControl control, AnimChannel channel, String animName) {
    if (animName.equals("Walk")) {
      channel.setAnim("stand", 0.50f);
      channel.setLoopMode(LoopMode.DontLoop);
      channel.setSpeed(1f);
    }
  }
    public void onAnimChange(AnimControl control, AnimChannel channel, String animName) {
    // unused
  }
    
      /** Custom Keybinding: Map named actions to inputs. */
  private void initKeys() {
    inputManager.addMapping("Walk", new KeyTrigger(KeyInput.KEY_SPACE));
    inputManager.addListener(actionListener, "Walk");
  }
  
  private ActionListener actionListener = new ActionListener() {
    public void onAction(String name, boolean keyPressed, float tpf) {
      if (name.equals("Walk") && !keyPressed) {
        if (!channel.getAnimationName().equals("Walk")) {
          channel.setAnim("Walk", 0.50f);
          channel.setLoopMode(LoopMode.Loop);
        }
      }
    }
  };
    
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
    
}
