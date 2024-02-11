package v1.domain.realtApiDTO;

import v1.domain.Flat;

import java.util.List;

public class ObjectView {
   private List<ShowCase> showcases;
   private Shortcut shortcuts;

   private ObjectViewConfig objectViewConfig;
   private Flat object;

   public ObjectView() {
   }

   public ObjectView(List<ShowCase> showcases, Shortcut shortcuts, ObjectViewConfig objectViewConfig, Flat object) {
      this.showcases = showcases;
      this.shortcuts = shortcuts;
      this.objectViewConfig = objectViewConfig;
      this.object = object;
   }

   public List<ShowCase> getShowcases() {
      return showcases;
   }

   public void setShowcases(List<ShowCase> showcases) {
      this.showcases = showcases;
   }

   public Shortcut getShortcuts() {
      return shortcuts;
   }

   public void setShortcuts(Shortcut shortcuts) {
      this.shortcuts = shortcuts;
   }

   public ObjectViewConfig getObjectViewConfig() {
      return objectViewConfig;
   }

   public void setObjectViewConfig(ObjectViewConfig objectViewConfig) {
      this.objectViewConfig = objectViewConfig;
   }

   public Flat getObject() {
      return object;
   }

   public void setObject(Flat object) {
      this.object = object;
   }
}
