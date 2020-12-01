// Empty constructor
function externalKeyboard() {}

// The function that passes work along to native shells
// layoutGroupName is a string (default: "Vanboxtel_Null_Keyboard", layout is a string (default: "Null_Keyboard")
externalKeyboard.prototype.selectLayout = function(successCallback, errorCallback,layoutGroupName,layout) {
  var options = {};
  options.layoutGroupName = String(layoutGroupName);
  options.layout = String(layout);
  cordova.exec(successCallback, errorCallback, 'ExternalKeyboard', 'selectLayout', [options]);
}

// Installation constructor that binds ZebraKeyboardPlugin to window
externalKeyboard.install = function() {
  if (!window.plugins) {
    window.plugins = {};
  }
  window.plugins.externalKeyboard = new externalKeyboard();
  return window.plugins.externalKeyboard;
};
cordova.addConstructor(externalKeyboard.install);
