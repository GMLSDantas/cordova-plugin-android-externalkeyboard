// Empty constructor
function externalKeyboard() {}

// The function that passes work along to native shells
// layoutGroupName is a string (default: "Vanboxtel_Null_Keyboard", layout is a string (default: "Null_Keyboard")
externalKeyboard.prototype.isKeyboardPlugged = function(successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback);
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
