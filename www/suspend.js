
var plugin = {
    suspendApp: function(successCallback, failureCallback) {
        return cordova.exec(successCallback, failureCallback, 'Suspend', 'suspendApp', []);
    }
};

module.exports = plugin;